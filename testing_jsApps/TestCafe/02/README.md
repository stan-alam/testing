**02**

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%201.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%202.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%203.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%204.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%205.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%206.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%207.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%208.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%209.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2010.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2011.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2012.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2013.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2014.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2015.png" width="80%" height="80%">
</a>

```text

.find(cssSelector): Finds the descendant nodes of all the nodes in the
matched set and uses a CSS selector to filter them (the CSS selector should be a
string)
```

https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/find.html

```text
.parent(index): Finds the parents of all the nodes in the matched set (the first
element in the set is the closest parent)
```

https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/parent.html

```text
.child(index): Finds the child elements of all nodes in the matched set
```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/child.html


```text
.sibling(index): Finds the sibling elements of all the nodes in the matched set
```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/sibling.html

```text
.nextSibling(index): Finds the succeeding sibling elements of all the nodes in the matched set
```

https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/nextsibling.html

```text
.prevSibling(index): Finds the preceding sibling elements of all nodes in the matched set and filters them by index

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/prevsibling.html


<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2016A.png" width="80%" height="80%">
</a>

```text

.nth(index): Selects an element with the specified index in the matched set.
Here, the index argument should be a zero-based number (0 will be the closest relative element in the set). If it is negative, the index is counted from the end of the matched set

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/nth.html

```text

.withText(text): Selects elements that contain the specified text. Here, text is the element's text content the text argument is a case-sensitive string or a regular expression (RegExp) that should match the element's text

```
 https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/withtext.html)

```text
.withExactText(text): Selects elements whose text content strictly matches the specified text. Here, text is the element's text content the text argument is a case-sensitive string

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/withexacttext.html

```text
.withAttribute(attrName[, attrValue]): Selects elements that contain the specified attribute. Here, attrName can be a case-sensitive string
or a RegExp, and optionally, attrValue can also be a case-sensitive string or a RegExp
```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/withattribute.html

```text

.filterVisible(): Selects elements that do not have the display:
none; or visibility: hidden; CSS properties and have non-zero widths and
heights

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/filtervisible.html

```text
.filterHidden(): Selects elements that have the display: none; or visibility: hidden; CSS properties, or zero widths or heights

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/filterhidden.html

```text
.filter(cssSelector): Selects elements that match the CSS selector (the CSS selector should be a string used to filter child elements). Also, instead of the
cssSelector argument, you could provide filterFn (a function predicate used to filter the elements) and, optionally, dependencies (an object with functions,
variables, or objects passed to the filterFn function)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/filter.html


<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2016B.png" width="80%" height="80%">
</a>


```text
Before test launch: It can be specified for all elements with the selectorTimeout config option in the .testcaferc.json configuration file
```
https://devexpress.github.io/testcafe/documentation/reference/configuration-file.html

```text
During test launch: It can be set for all elements with the --selector-timeout

command-line option
```
https://devexpress.github.io/testcafe/documentation/reference/command-line-interface.html

```text
#--selector-timeout-ms
```

```text
In test code: It can be set as an additional option inside Selector
```
 https://devexpress.github.io/testcafe/documentation/reference/test-api/selector/constructor.html#optionstimeout

```text
 to set the timeout for any particular element.
 ```

 <a>
   <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2017.png" width="80%" height="80%">
 </a>


```text
.click(selector[, options]): Clicks on an element on a page

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/click.html)

```text
.doubleClick(selector[, options]): Double-clicks on an element on a page
```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/doubleclick.html)

```text
.rightClick(selector[, options]): Right-clicks on an element on a page

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/rightclick.html)

```text
.pressKey(keys[, options]): Presses the specified keyboard keys. Here, keys is a sequence of keys and key combinations to be pressed

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/presskey.html)

```text
.navigateTo(url): Navigates to the specified URL. Here, url is a string with the URL to navigate to (which can be absolute or relative to the current page

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/navigateto.html

```text
.typeText(selector, text[, options]): Types the specified text into an input element. Here, text is a string of the text to be typed into the specified web page element

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/typetext.html

```text
.selectText(selector[, startPos][, endPos][, options]): Selects text in input elements of various types. Here, startPos is the number (zero-based integer, 0 by default) of the start position of the selection. Optionally,
endPos is the number (zero-based integer; by default, it is equal to the length of the visible text content) of the end position of the selection

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/selecttext.html

```text
.hover(selector[, options]): Hovers the mouse pointer over a web page element

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/hover.html

```text
.drag(selector, dragOffsetX, dragOffsetY[, options]): Dragsan element to a specified offset. Here, dragOffsetX is the number of pixels for
the X offset (horizontal) of the drop coordinates from the original position of the mouse pointer, and dragOffsetY is the number of pixels for the Y offset (vertical) of the drop coordinates from the original position of the mouse pointer

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/drag.html

```text
.dragToElement(selector, destinationSelector[, options]): Drags an element onto another web page element. Here, destinationSelector
should identify the web page element that will be the drop location

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/dragtoelement.html

```text
.setFilesToUpload(selector, filePath): Adds file paths to the specified file upload input. Here, filePath is a string or an array with the path
to the uploaded file (or several paths, in the case of an array). Relative paths
are resolved against the folder with the test file

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/setfilestoupload.html

```text
.clearUpload(selector): Deletes all the file paths from the specified
file upload input

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/clearupload.html

```text
.takeScreenshot([options]): Takes a screenshot of the entire page. The
optional options object can include the following properties: the path string with the screenshot file's relative path and name or a fullPage boolean
(false by default) that specifies if the full page should be captured, including content that is not visible due to overflow

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/takescreenshot.html

```text
.takeElementScreenshot(selector[, path][, options]):
Takes a screenshot of the specified web page element. Here, path (an optional
argument) is a string with the screenshot file's relative path and name

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/takeelementscreenshot.html

```text
.switchToIframe(selector): Switches the browsing context of the
test to the specified <iframe>

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/switchtoiframe.html

```text
.switchToMainWindow(): Switches the browsing context of the test from an
<iframe> back to the main window

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/switchtomainwindow.html

```text

.setNativeDialogHandler(fn(type, text, url)[, options]):
Specifies a handler function to deal with native dialogs triggered during the test run. Here, fn(type, text, url) can be a function or a client function
that will be invoked whenever a native dialog is triggered (null to delete the native dialog handler). The handler function can utilize three arguments: type,
which is a string with the type of the native dialog (confirm, alert, prompt, or beforeunload); text, which is a string with the dialog message text; and
url, which is a string with the URL of the page that triggered the dialog (used to check whether the dialog was called from the main window or an <iframe>)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/setnativedialoghandler.html

```text
.getNativeDialogHistory(): Provides a history of the native dialogs
that were triggered

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/getnativedialoghistory.html

```text
.resizeWindow(width, height): Resizes a window to fit the provided width and height, where width is the value of the new width (in pixels) and height is
the value of the new height (in pixels)

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/resizewindow.html)

```text
.resizeWindowToFitDevice(deviceName[, options]): Resizes the
window to fit the screen of the specified mobile device, where deviceName is a string with the device name

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/resizewindowtofitdevice.html)

```text
.maximizeWindow(): Maximizes the browser window

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/maximizewindow.html

```text  
.wait(timeout): Pauses a test execution for a specified period of time. Here, timeout is the length of the pause duration (in milliseconds)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/wait.html)

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2018A.png" width="80%" height="80%">
</a>

```text
 .expect(actual).eql(expected[, message][, options]): Verifies that the actual value is equal to the expected value. Here, actual is any type
of comparison value and expected is any type of expected value
```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/eql.html
```text
.expect(actual).notEql(expected[, message][, options]):Verifies that the actual value does not equal the expected value. Here, actual is any type of comparison value and expected
is any type of value that is expected not to be equal to actual

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/noteql.html

```text
.expect(actual).ok([message][, options]): Verifies that the
actual value is true. Here, actual is any type of value tested in the assertion (the assertion will pass if the actual value is true)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/ok.html

```text
.expect(actual).notOk([message][, options]): Verifies that the actual value is false. Here, actual is any type of value tested in the assertion
(the assertion will pass if the actual value is false)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notok.html

```text
.expect(actual).contains(expected[, message][, options]):
Verifies that the actual value contains the expected value. Here, actual is any type of comparison value and expected is any type of expected value (the
assertion will pass if the actual value contains the expected value)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/contains.html

```text
.expect(actual).notContains(expected[, message][,
options]): Verifies that the actual value contains the expected value. Here, actual is any type of comparison value, and expected is any type of expected
value (the assertion will pass if the actual value does not contain the expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notcontains.html

```text
.expect(actual).typeOf(typeName[, message][, options]):
Asserts that the actual value type is typeName. Here, actual is any type of comparison value and typeName is a string of the expected type of an actual value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/typeof.html

```text
.expect(actual).notTypeOf(typeName[, message][, options]): Asserts that the actual value type is not typeName. Here, actual is any type
of comparison value and typeName is a string of the type of the actual value that causes an assertion to fail

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/nottypeof.html


```text
.expect(actual).gt(expected[, message][, options]): Verifies
that the actual value is greater than the expected value. Here, actual is the number tested in the assertion (the assertion will pass if the actual value is greater than the expected value)
and expected is any type of expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/gt.html

```text
.expect(actual).gte(expected[, message][, options]): Verifies
that the actual value is greater than or equal to the expected value. Here, actual is a number tested in the assertion (the assertion will pass if the actual value is greater than or equal to the expected value), and expected is any type of expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/gte.html

```text
.expect(actual).lt(expected[, message][, options]): Verifies that the actual value is less than the expected value. Here, actual is the
number tested in the assertion (the assertion will pass if the actual value is less than the expected value) and expected is any type of expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/lt.html

```text
.expect(actual).lte(expected[, message][, options]): Verifies that the actual value is less than or equal to the expected value. Here, actual is the number tested in the assertion (the assertion will pass if the actual value is less than or equal to the expected value) and expected is any type of expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/lte.html

```text
.expect(actual).within(start, finish[, message][, options]): Verifies that the actual value is within a specified range from
start to finish (bounds are inclusive). Here, actual is a number, start is the number for the lower range (inclusive), and finish is the number for the upper range (inclusive)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/within.html

```text
.expect(actual).notWithin(start, finish[, message][, options]): Verifies that the actual value is not within the specified range
from start to finish (bounds are inclusive). Here, actual is a number, start is the number for the lower range (inclusive), and finish is the number for the
upper range (inclusive)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notwithin.html

```text
.expect(actual).match(re[, message][, options]): Verifies that the actual value matches the re regular expression. Here, actual is any type of comparison value and re is a regular expression that is expected to match the actual value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/match.html

```text
.expect(actual).notMatch(re[, message][, options]): Verifies
that the actual value does not match the re regular expression. Here, actual is any type of comparison value and re is a regular expression that is expected not to match the actual value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notmatch.html

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2018B.png" width="80%" height="80%">
</a>

```text
.expect(actual).eql(expected[, message][, options]): Verifies that the actual value is equal to the expected value. Here, actual is any type of comparison value and expected is any type of expected value

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/eql.html

```text
.expect(actual).notEql(expected[, message][, options]): Verifies that the actual value does not equal the expected value. Here, actual
is any type of comparison value and expected is any type of value that is expected not to be equal to actual

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/noteql.html

```text
 .expect(actual).ok([message][, options]): Verifies that the actual value is true. Here, actual is any type of value tested in the assertion
the assertion will pass if the actual value is true)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/ok.html


```text
.expect(actual).notOk([message][, options]): Verifies that the actual value is false. Here, actual is any type of value tested in the assertion
(the assertion will pass if the actual value is false)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notok.html

```text

.expect(actual).contains(expected[, message][, options]): Verifies that the actual value contains the expected value. Here, actual is
any type of comparison value and expected is any type of expected value (the assertion will pass if the actual value contains the expected value)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/contains.html

```text
.expect(actual).notContains(expected[, message][, options]): Verifies that the actual value contains the expected value. Here, actual is any type of comparison value, and expected is any type of expected
value (the assertion will pass if the actual value does not contain the expected value

```  
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notcontains.html

```text
.expect(actual).typeOf(typeName[, message][, options]): Asserts that the actual value type is typeName. Here, actual is any type of comparison value and typeName is a string of the expected type of an actual
value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/typeof.html


```text
.expect(actual).notTypeOf(typeName[, message][, options]): Asserts that the actual value type is not typeName. Here, actual is any type of comparison value and typeName is a string of the type of the actual value that causes an assertion to fail

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/nottypeof.html

```text
.expect(actual).gt(expected[, message][, options]): Verifies that the actual value is greater than the expected value. Here, actual is the
number tested in the assertion (the assertion will pass if the actual value is greater than the expected value) and expected is any type of expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/gt.html

```text
.expect(actual).gte(expected[, message][, options]): Verifies
that the actual value is greater than or equal to the expected value. Here, actual is a number tested in the assertion (the assertion will pass if the actual
value is greater than or equal to the expected value), and expected is any type of expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/gte.html

```text
.expect(actual).lt(expected[, message][, options]): Verifies that the actual value is less than the expected value. Here, actual is the number tested in the assertion (the assertion will pass if the actual value is less than the expected value) and expected is any type of expected value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/lt.html

```text
.expect(actual).lte(expected[, message][, options]): Verifies that the actual value is less than or equal to the expected value. Here, actual
is the number tested in the assertion (the assertion will pass if the actual value is less than or equal to the expected value) and expected is any type of expected
value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/lte.html

```text
.expect(actual).within(start, finish[, message][, options]): Verifies that the actual value is within a specified range from start to finish (bounds are inclusive). Here, actual is a number, start is
the number for the lower range (inclusive), and finish is the number for the
upper range (inclusive)

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/within.html

```text
.expect(actual).not Within(start, finish[, message][, options]): Verifies that the actual value is not within the specified range
from start to finish (bounds are inclusive). Here, actual is a number, start is the number for the lower range (inclusive), and finish is the number for the
upper range (inclusive)

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notwithin.html

```text
.expect(actual).match(re[, message][, options]): Verifies that the actual value matches the re regular expression. Here, actual is any type of
comparison value and re is a regular expression that is expected to match the actual
value

```

https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/match.html

```text
.expect(actual).notMatch(re[, message][, options]): Verifies that the actual value does not match the re regular expression. Here, actual is any type of comparison value and re is a regular expression that is expected not to match the actual value

```
https://devexpress.github.io/testcafe/documentation/reference/test-api/testcontroller/expect/notmatch.html


<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2019A.png" width="80%" height="80%">
</a>

```text
Insert Methods
```
<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2019B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2020.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2021A.png" width="80%" height="80%">
</a>


```js
//44A.js
const { Role, Selector } = require('testcafe');

const serviceProvider = Role('https://nannerl.io', async
  (t) => {
    await t.typeText('.login', 'service_provider123')
        .typeTest('.password', 'blink one hundred and eighty two')
        .click('#log-in'); //note the selector jquery like in Selenide wrapper API for Selenium
  });

  const admin = Role('https://nannerl.io', async
    (t) => {
      await t.typeText('.login', 'admin')
          .typeTest('.password', 'adminpassword123')
          .click('#log-in');
    });

const linkLoggedInServiceProvider = Selector('.link-service-provider');
const linkLoggedInAdmin           = Selector('.link-admin');

fixture('Inital Test Fixture').page('https://nannerl.io');

test('Test Login with Three Roles, Admin, Service Provider, Subscriber', async (t) => {
  await t.useRole(serviceProvider) //useRole method
      .expect(linkLoggedInServiceProvider.exists).ok() //positive test
      .useRole(admin)
      .expectRole(admin)
      .expect(linkLoggedInServiceProvider.exists.notOk() //negative test, check to see that you are NOT logged in as serviceProvider
      .expect(linkLoggedInAdmin.exists.ok() //positive test, check that you're logged in as admin
      .useRole(Role.Subscriber())
      .expect(linkLoggedInServiceProvider.exists).notOk()
      .expect(linkLoggedInAdmin.exists).notOk()

)};
```
<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2021B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2022.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2023.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2024.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/02/images/testCafe02%20-%20page%2025.png" width="80%" height="80%">
</a>
