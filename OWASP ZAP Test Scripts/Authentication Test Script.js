// L00167791
// Test Authorization for User Registration
// 
// description Test if authorization controls are in place for User registration

// Define the target extension (assuming ZAP is properly configured)
var extAscan = org.zaproxy.zap.extension.ascan.ExtensionActiveScan;

// Define your test cases with different authorization levels
var testCases = [
    { username: "admin", password: "adminpassword", expectedResponseCode: 200 },
    { username: "user", password: "userpassword", expectedResponseCode: 403 },  // Unauthorized
];

// Loop through the test cases and test User registration authorization
for (var i = 0; i < testCases.length; i++) {
    var testCase = testCases[i];
    
    // Create an HTTP message for the registration request
    var msg = helper.prepareMessage();
    msg.setRequestHeader("POST http://example.com/user/register HTTP/1.1");
    msg.getRequestHeader().setHeader("Content-Type", "application/x-www-form-urlencoded");

    // Customize the request body with the user's credentials
    var requestBody = "username=" + encodeURIComponent(testCase.username) + "&password=" + encodeURIComponent(testCase.password);
    msg.setRequestBody(requestBody);

    // Send the registration request
    helper.getHttpSender().sendAndReceive(msg);

    // Check the response code for authorization
    if (msg.getResponseHeader().getStatusCode() === testCase.expectedResponseCode) {
        print("Authorization test passed for user: " + testCase.username);
    } else {
        print("Authorization test failed for user: " + testCase.username);
    }
}