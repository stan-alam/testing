## 03

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%201.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%202.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%203.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%204.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%205A.png" width="80%" height="80%">
</a>

```js

{
	"reporter": [{
			"name": "minimal"
		},
		{
			"name": "xunit",
			"output": "test/reports/report.xml"
		},
		{
			"name": "json",
			"output": "test/report/report.json"
		}
	]
}

```

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%205B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%206A.png" width="80%" height="80%">
</a>

```js

{
	"screenshots": {
		"path": "test/scrnshots",
		"takeOnFails": true,
		"pathPattern": "${DATE}_${TIME}/test-${TEST_INDEX}/${USERAGENT}/${FILE_INDEX}.png",
		"fullpage": false
	}
}


```

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%206B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/testing_jsApps/TestCafe/03/images/testCafe03%20-%20page%207.png" width="80%" height="80%">
</a>

```js

{
	"videoOptions": {
		"singleFile": true,
		"failedOnly": true,
		"pathPattern": "${TEST_INDEX}/${USERAGENT}/${FILE_INDEX}.mp4"
	}
}

```
