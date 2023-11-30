from selenium import webdriver
from selenium.webdriver.chrome.service import Service
import time
from selenium.webdriver import Chrome
from selenium.webdriver.common.by import By

driver = Service(executable_path = "C:/Users/user/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe")
browser = webdriver.Chrome(service = driver)

browser.get("https://www.facebook.com")

browser.maximize_window()
browser.refresh()
print(browser.title)

assert "Giriş Yap" in browser.title

user_name = browser.find_element(By.NAME, "email")
user_name.send_keys("Belaynesh")

user_password = browser.find_element(By.NAME, "pass")
user_password.send_keys("Belaynesh")

login_button = browser.find_element(By.NAME, "login")
login_button.click()

time.sleep(20)
browser.quit()