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
