from selenium import webdriver
from selenium.webdriver.chrome.service import Service
import time
from selenium.webdriver import Chrome
from selenium.webdriver.common.by import By

driver = Service(executable_path = "C:/Users/user/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe")
browser = webdriver.Chrome(service = driver)

browser.get("https://stix.uskudar.edu.tr/login")

browser.maximize_window()
browser.find_element(By.LINK_TEXT, "Giriş / Sign in").click()
time.sleep(3)

browser.find_element(By.ID, "i0116").send_keys("email here")
browser.find_element(By.ID, "idSIButton9").click()
time.sleep(3)

browser.find_element(By.ID, "i0118").send_keys("password here")
browser.find_element(By.ID, "idSIButton9").click()
time.sleep(3)

browser.find_element(By.ID, "idBtn_Back").click()
time.sleep(3)

time.sleep(20)
browser.quit()
