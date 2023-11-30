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


try:
    path = f"{Path().absolute()}\\bsc23_season\login.html"

    driver.get(path)
except:
    path = path.replace("\\", "/")
    driver.get(path)

title = driver.title

driver.implicitly_wait(0.5)

text_box = driver.find_element(by=By.NAME, value="entername")
submit_button = driver.find_element(by=By.CSS_SELECTOR, value="button")
password_box = driver.find_element(by=By.NAME, value="psw")

text_box.send_keys("Selenium")
password_box.send_keys("Hello")
driver.implicitly_wait(100)
submit_button.click()

driver.implicitly_wait(0.5)

message = driver.find_element(by=By.NAME, value="Hello")
text = message.text

print(text)

driver.quit()