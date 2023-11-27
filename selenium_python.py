from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path
import os

driver = webdriver.Chrome()
print(f"Directory Path: {Path().absolute()}\login.html")

driver.get(f"{Path().absolute()}\login.html")

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