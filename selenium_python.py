from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path
import os
from selenium.webdriver.firefox.options import Options

firefox_options = Options()
firefox_options.headless = True
driver = webdriver.Firefox(options=firefox_options)
print(f"Directory Path: {Path().absolute()}\\login.html")

def verify_reach_homepage(text: str):
    if "Hello World!" in text:
        return "We can confirm we are reaching the homepage"
    else:
        return "We are not getting to the homepage"

try:
    path = os.path.join(Path().absolute(), "login.html")

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

verify_reach_homepage(text)

driver.quit()