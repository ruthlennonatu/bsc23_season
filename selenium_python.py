'''
This script runs through the login.html & homepage.html webpages 
and verifies that they are still working as 
expected with the expected output of "Hello World" printed to console.


'''


from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path
import os

driver = webdriver.Chrome()
print(f"Directory Path: {Path().absolute()}\\bsc23_season\login.html")


'''
This function verifies that the user gets to the homepage
of our website
'''
def verify_reach_homepage(text: str):
    if "Hello World!" in text:
        return "We can confirm we are reaching the homepage"
    else:
        return "We are not getting to homepage"

# depending on if we're using a linux or windows machine, 
# forward or backslashes may work better here
try:
    path = f"{Path().absolute()}\\login.html"

    driver.get(path)
except:
    path = path.replace("\\", "/")
    driver.get(path)

title = driver.title

driver.implicitly_wait(0.5)

# these are looking for the elements on the login page
text_box = driver.find_element(by=By.NAME, value="entername")
submit_button = driver.find_element(by=By.CSS_SELECTOR, value="button")
password_box = driver.find_element(by=By.NAME, value="psw")

# entering spoof data into username and password
text_box.send_keys("Selenium")
password_box.send_keys("Hello")

driver.implicitly_wait(100)

# submit the data to the next page
submit_button.click()

driver.implicitly_wait(0.5)

message = driver.find_element(by=By.NAME, value="Hello")
text = message.text

print(text)

verify_reach_homepage(text)

driver.quit()