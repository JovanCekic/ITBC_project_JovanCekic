# Testing DemoQA site with Selenium
This project implements automated end-to-end tests of the DemoQA 
website using TestNG and Selenium 
for the QA tester course in IT Bootcamp

## Tests for UI Elements
- Text box
- Check box
- Radio buttons
- Buttons

Path to Chrome Web Driver
Java version

## Project Setup
Java version used: 1.8

Install Maven dependencies before running the project.

### Configure the Web Driver
1. Download Chrome driver for the version of Chrome browser you have installed on your computer from the following link:
[Chrome Driver Download Page](https://sites.google.com/chromium.org/driver/downloads)
2. Extract zip file
3. Edit line 73 in the file `src/main/java/toolsQA/tests/BaseTest.java` to contain path to extracted Web Driver file
