const apiUrl = '/emailValidation'; 

const email = new email(apiUrl);

document.getElementById('email').addEventListener('submit', function (e) 
{
  const email = document.getElementById('textField').value;
  email.verifyEmail(email)
    // Check if the email exists then output
    .then(isVerified => {
      if (isVerified) {
        console.log('Email already exists in the database.');
      } else {
        // If the email doesn't exist output
        console.log('Email does not exist in database.');
      }
    })
});