from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from pathlib import Path
import chromedriver_autoinstaller
from pyvirtualdisplay import Display
display = Display(visible=0, size=(800, 800))  
display.start()
import os

chromedriver_autoinstaller.install()  # Check if the current version of chromedriver exists
                                      # and if it doesn't exist, download it automatically,
                                      # then add chromedriver to path

chrome_options = webdriver.ChromeOptions()    
# Add your options as needed    
options = [
  # Define window size here
   #"--window-size=1200,1200",
    "--ignore-certificate-errors"
 
    "--headless",
    #"--disable-gpu",
    #"--window-size=1920,1200",
    #"--ignore-certificate-errors",
    #"--disable-extensions",
    #"--no-sandbox",
    #"--disable-dev-shm-usage",
    #'--remote-debugging-port=9222'
]

# testing

def verify_reach_homepage(text: str):
    if "Hello World!" in text:
        return "We can confirm we are reaching the homepage"
    else:
        return "We are not getting to the homepage"

for option in options:
    chrome_options.add_argument(option)

    
driver = webdriver.Chrome(options = chrome_options)

html_file_path = "login.html"

github_workspace = os.getenv("GITHUB_WORKSPACE")

local_html_path = f"file://{github_workspace}/login.html"

# full_path = os.path.join(current_directory, html_file_path)

print(local_html_path)

driver.get(local_html_path)

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

#verify_reach_homepage(text)

driver.quit()