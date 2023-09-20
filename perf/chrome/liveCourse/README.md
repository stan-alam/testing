## Discovering Backend Bottlenecks: Unlocking Peak Performance

```text
Harness Chrome DevTools, MITM Proxy, and Wireshark to Pinpoint and Resolve Bottlenecks in Your Backend Stack

I used to think that performance of the backend depends on the application logic itself. However, there are many other factors that play a role in overall quality and performance of the application. Networking, connection establishment, security, backend communication, protocol serialization, intermediaries and much more.

Often debugging the app if you have the source code allows the developer to zone in to the problem and identify it, However most of the time as an engineer you either don’t have access to the source code or its time consuming to debug a complex app. That is why in this course I present you with some tools I use to analyze the backend application performance and provide a good guess and what might be the problem without stepping in the code. Often known as black box testing.

If your application is a web application that is consumable through a browser, devtools allow us to pretty much inspect all traffic going out from the app and can tell us so much about the app. If the app is not available in the browser we will then demonstrate MITM proxy which is a proxy that intercepts HTTP traffic and log it, this way we can inspect requests and see which of those are the culprit. Finally, if the app uses a protocol that isn’t HTTP intercepting it with a proxy becomes little tricky, so we will use both tcpdump and Wireshark to capture low level packets and see our requests this way.

This course is designed for developers and engineers who have built backend and frontend applications and would like to take their skills further. This course is intermediate to advanced and it is recommended that students have a background in networking and backend fundamentals both of which I have courses for.
```
What you’ll learn

Identify bottlenecks in backend applications
Find where latencies live
Intercept slow requests from Mobile and Web Apps
Using DevTools Networking tap to its full potentional
Using Man in the middle proxy MITM to intercept HTTP requests
Using Wireshark for packet inspections
Real-world Performance Analysis of Backend Applications
Table of Contents
Introduction
1 Welcome
2 Who is this course for
3 Course Outline
4 Socket Programming Backend C WebServer Setup
5 The Kernel Accept Send and Receive queues
6 Course downloadable resources

Supplementary Lectures Fundamentals
7 Supplementary Lectures
8 OSI Model
9 Internet Protocol
10 TCP
11 Proxy vs Reverse Proxy

Tier 1 Analysis DevTools
12 Tier 1 Analysis
13 Anatomy of a RequestResponse
14 DevTools Networking Part 1 RequestResponse Columns
15 DevTools Networking Part 2 Waterfall
16 Identify Slow Processing Requests with DevTools
17 Identify Slow Network Speed and Downloadstreaming issues
18 Identify Slow Connection establishment with DevTools
19 Identify Slow DNSTLS with DevTools
20 DevTooling Twitter Web

Tier 2 Analysis MITM Proxy
21 Tier 2 Analysis
22 MITM Proxy Part 1 mitmproxymitmdump and mitmweb
23 MITM Proxy Part 2 Intercepting SSL
24 Identify Slow Processing Requests with MITMProxy
25 Identify Slow Network Speed and Downloadstreaming issues
26 Identify Slow Connection establishment with MITMProxy
27 Intercepting Mobile Applications
28 Intercept HTTP traffic between Microservices

Tier 3 Analysis Wireshark
29 Tier 3 Analysis
30 Introduction to Wireshark Part 1 Traffic Analysis
31 Introduction to Wireshark Part 2 Decrypting HTTPSTLS
32 Identify Slow Request Processing with Wireshark
33 Identify Slow Network Speed and Downloadstreaming issues
34 Identify Slow Connections with Wireshark
35 Identify Slow Reading Backends TCP Zero Window
36 Wiresharking Postgres

Realworld Performance Analysis of Backend Applications
37 Realworld Examples
38 The Application
39 Example 1 Frontend Performance
40 Example 2 Backend Performance
41 Example 3 Backend Performance with LoadBalancer
42 Example 4 Database Performance

Course Summary
43 Other essential tools
44 What we learned

Answering Your questions
45 How does the Kernel manage backend connections