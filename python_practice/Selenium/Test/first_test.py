from selenium import webdriver
import time


driver = webdriver.Chrome(r"C:\Users\ghimi\python practice\Selenium\lib\chromedriver.exe")

driver.get("https://www.google.com")
driver.find_element_by_name("q").send_keys("youtube")
driver.find_element_by_name("btnK").click()
driver.maximize_window()
driver.implicitly_wait(5)
driver.close()
driver("Test completeted")