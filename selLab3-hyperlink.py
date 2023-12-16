import requests as requests
from selenium import webdriver
from selenium.common import TimeoutException
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


driver_instance = Service(executable_path="C:/Users/user/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe")
browser_instance = webdriver.Chrome(service =driver_instance)
browser_instance.get("https://stix.uskudar.edu.tr/student")

links = browser_instance.find_elements(By.TAG_NAME, "a")

print("Number of links in site: " + str(len(links)))

for link in links:
    print("Link text: " + str(link.text))
    if requests.head(link.get_attribute('href')).status_code == 200:
        print("Link is valid!\n")
    elif requests.head(link.get_attribute('href')).status_code == 400:
        print("Bad request\n")
    elif requests.head(link.get_attribute('href')).status_code == 401:
        print("Unauthorized\n")
    elif requests.head(link.get_attribute('href')).status_code == 404:
        print("Page not found\n")
    elif requests.head(link.get_attribute('href')).status_code == 500:
        print("Internal error\n")
    elif requests.head(link.get_attribute('href')).status_code == 302:
        print("Redirection\n")
    else:
        print("Unknown value:" + str(requests.head(link.get_attribute('href')).status_code) + "\n")