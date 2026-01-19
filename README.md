# GSM-Lab: Green Software Measurement Laboratory


[Alberto Gordillo](https://orcid.org/0000-0002-4742-173X)  

[Carlos Pulido](https://orcid.org/0009-0008-8122-3500)

[Félix García](https://orcid.org/0000-0001-6460-0353)

[Mª Ángeles Moraga](https://orcid.org/0000-0001-9165-7144)

[Coral Calero](https://orcid.org/0000-0003-0728-4176)



## Abstract

Growing energy consumption has raised global awareness of the need to reduce it, driving efforts in various disciplines, including software engineering. In the field of software, it is essential to measure and evaluate software energy consumption to promote improvements that drive to the reduction of the consumption. However, software energy consumption measurement is complex and requires specialised knowledge and tools. In this paper, we present GSMLab: a laboratory that enables users to perform software application consumption measurements. GSMLab is an evolution and improvement of FEETINGS (Framework for Energy Efficiency Testing to Improve Environmental Goal of the Software), designed to perform software consumption measurements and automatically collect and analyse the results. To transform FEETINGS into a fully functional laboratory it was necessary to extend the framework’s capabilities. These enhancements include, among others, enabling the automatic initiation of measurements, supporting distributed software measurements and managing the various computers available for experimentation. 
This paper describes all these modifications and presents the final outcome. To demonstrate its utility, it also includes a case study involving the energy consumption measurement of a client-server application.
We expect this laboratory will contribute to advancements in the field of green software by offering measurement capabilities as a service, allowing any software professional to assess the energy consumption of their applications without needing to acquire specialized knowledge or infrastructure.

## What is this?

This repository contains the source code used for this study., which were obtained from: Blinowski G, Ojdowska A, Przybylek A (2022) Monolithic vs. microservice architecture: A performance and scalability evaluation. IEEE Access 10:20357–20374

## How is structured?

This folder contains three main folders: code, empirical results and sample logs.

## Code Folder

The code folder contains the software applications that have been measured in this study.

#### The Operations

Each algorithm sub-folder, included in a programming language folder, contains a `Makefile`.
TThis is the file which shows how to perform the 2 main operations: *(1)* **compilation** and *(2)* **execution**.

Basically, each `Makefile` **must** contain a rule:

| Rule | Description |
| -------- | -------- |
| `run` | This rule specifies how the software should be executed; It is used to test whether the software runs with no errors and the output is the expected. 

```
## Empirical Results Folder

The empirical results folder includes all the information on the analysis of the energy consumption of the software. The basic terminology used is as follows:
- An entity class or version corresponds to a monolithic/microservice applicacion. 
- The test case is an call running in a determined monolithic/microservice architecture.
- Measurement is each of the executions of a testcase.

It is structured as follows:

```Java
|<report>
	| <EntityClass-1>@<TestCase-1>.xls
	| ...
	| <EntityClass-i>@<TestCase-i>.xls
	| <img>
		| <EntityClass-1>@<TestCase>_<Device-1>.png
		| ...
		| <EntityClass-i>@<TestCase>_<Device-i>.png
		|
		| <EntityClass-1>@<TestCase>_dut-1.png
		| ...
		| <EntityClass-i>@<TestCase>_dut-i.png

| testcases_averages__comparison.xlsx
| testcases_Mann-WhitneyUTest.xlsx
| testcases_total.xlsx
| versions_averages_comparison
| versions_Mann-WhitneyUTest.xlsx
| versions_spearman.xlsx
| versions_total.xlsx

```
To facilitate the comparison of information, the file "testcases_total" contains one sheet for each statistical value of all test cases. These statistical values are:
Consumption average without baseline, Consumption average (with baseline), Baseline, Power average without baseline, Power average (with baseline) and Standard deviation among measurments.

Baseline is the idle consumption that has been subtracted for each test case. To obtain this, the idle consumption of the test case is measured 30 times before and after its execution. If they are equal, the value of the measurement prior to the execution of the test case is used. Should the idle values before and after the measurement differ, the measurement is repeated.

![](resources/testcases_total_example.PNG)

In the same way as the "testcase_total" document, the "versions_total" document contains the statistical values for each Entity Class.

![](resources/versions_total_example.PNG)


### Report Folder
The report folder contains the analysis data. One for each test case named `<EntityClass>@<Testcase>`. It also contains two files "testcases_total" and "versions_total" with the summary of the test case and entities software information respectively.
As an example, the following images show the information of a test case.

The first image shows all the information of a measurement.
![](resources/measurement_example.PNG)

The second image shows all the information of a test case.
![](resources/testcase_example.PNG)

On the other hand, there are the files "testcases_averages__comparison" and "versions_averages_comparison" that compare each test case and software entity respectively.

In addition, there are the documents with the statistics for each testcase and software entity:
"testcases_Mann-WhitneyUTest", "versions_Mann-WhitneyUTest" and "versions_spearman".

#### Img folder
The img folder contains the graphs of the overall consumption in the execution of each measurement performed. It also includes the box plots of each device for each test case and for each entity software.

## Sample Logs Folder
This folder contains an example of a log, to illustrate the raw data generated by the EET measurement instrument. 
- The json file contains the measurement information of the entity class.
- Each line of microservices-server_EX are the values obtained for id, time, monitor and DUT
- Each line of microservices-serve_IN are the values obtained for id, time, HDD(),HDD(2), Graphics card(1), Graphics card(2),Processor(1) and Processor(2).
DUT hardware components have two values because they have two sensors connected, the result of the DUT hardware component is the sum of the two values.

Note: The rest of the logs of this study are not included in the repository for practical reasons, due to their large size.

## Contacts and References

[Green Team Alarcos](https://greenteamalarcos.uclm.es/)
