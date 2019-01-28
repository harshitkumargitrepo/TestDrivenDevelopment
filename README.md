# Test Driven Development
Demonstrate Test Driven Development

## Concept:
Demonstrate how to use tests to drive the writing of your code, a key component of agile programming.This repository covers a range of practical topics that can help Java developers get up and running with test-driven development (TDD).

<b>Application: Conference Paper validation based on ISBN number</b>

<a href="https://dl.acm.org/citation.cfm?id=3226207"> Fairness In Reciprocal Recommendations: A Speed-Dating Study </a> 
Proceeding 
UMAP '18 Adjunct Publication of the 26th Conference on User Modeling, Adaptation and Personalization
Singapore, Singapore — July 08 - 11, 2018  
<b>ISBN: 978-1-4503-5784-5</b>

### What is test-driven development?
So, let's start with really understanding what is meant by test-driven development. Well, simply put, test-driven development means that we use tests to drive the writing of our code. 
In general, there's a workflow which we use which is normally described as red, green, refactor.

![Figure 1: Test Driven Development high level workflow](https://github.com/harshitkumargitrepo/TestDrivenDevelopment/blob/master/images/figure_1.PNG)

 
Red means that we'll be writing tests of business logic that we expect initially to fail. They'll fail because we haven't yet written any code to make the test pass. A test is something that'll validate that some code we have written is performing correctly. 
Green means that we'll write code, or correct code, so that our tests pass. 
And then refactor means that once we have our tests passing, we'll be able to refactor out code and our tests to make them more efficient. 
For now, something that is important to understand is that as we develop the functionality for our applications, we're going to be writing tests first before we write any code to make the tests pass. And this is going to be an iterative process. Each piece of functionality could require us to write a lot of tests.


### What do you want to test?

I want to just talk a little about what we will be writing tests for and what we won't be writing tests for. In general, we want to be writing tests that check a single identifiable piece of logic or behavior. This is a unit of functionality that we want to test, hence the phrase unit testing. We want to test single units of functionality in isolation. 

![Figure 2: Test Driven Development test](https://github.com/harshitkumargitrepo/TestDrivenDevelopment/blob/master/images/figure_2.PNG)

So, we won't be wanting to write tests that would check the validity of an end-to-end process, you’d probably call those integration tests. But it's not part of test-driven development, and we're not going to be needing those in this repository. 
We're going to have multiple tests for a single piece of logic. Each will be testing different scenarios that are meted to make up this logic. So, each test should test one piece of logic only and in fact a single scenario for that piece of logic. The idea is that by creating a suite of tests, testing different scenarios, then we'll test all the likely different combinations of logic. 

### The case study

Let's imagine that we've been given the task to write some code, which we'll check that an ISBN number is valid for a given conference paper published in ACM community. If you've not come across ISBN numbers before, it stands for international standard book number and these are the numbers that you find on the barcode on all books. The final digit of each ISBN number is a check digit. This means that you can calculate what the final digit should be from the other numbers that make up the barcode. Because of this, if any single digit is wrong, it's not a valid ISBN.
 
For example, 978-1-4503-5784-5 is a valid ISBN number, but if we change one digit, for example, the nine to a seven, then it becomes an invalid ISBN number. For this to be valid, the final digit would also have to change. So, we want to write some code that will take a full ISBN number, including it's check digit, and would indicate whether or not this is a valid ISBN number. Now if you want to look up what the rules are as to how to validate an ISBN number, then a good place to start would be with the Wikipedia page. We'll do a complete work through of the logic, and I'll explain that logic to you step by step. 
