import random
import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

serv_obj = Service(executable_path="C:/Users/user/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe")
driver = webdriver.Chrome(service=serv_obj)
driver.get("C:/Users/user/Desktop/test.html")

driver.maximize_window()
radiobox = driver.find_elements(By.NAME, "language")
r1 = driver.find_element(By.ID, "Python")
r2 = driver.find_element(By.ID, "Java")
r3 = driver.find_element(By.ID, "C++")

select = random.randint(1, 3)

if select == 1:
    r1.click()
elif select == 2:
    r2.click()
elif select == 3:
    r3.click()


for i in radiobox:
    if i.get_attribute("type") == "radio":
        print("It is a Radio button")
    else:
        print("It is not a Radio button")

    if i.is_enabled():
        print("It is enabled")
    else:
        print("Not enabled")

    if i.is_selected():
        print("It is selected")
    else:
        print("Not selected")

    if i.get_attribute("checked"):
        print("It is checked\n")
    else:
        print("Not checked\n")

time.sleep(8)
