学习Jacoco maven集成
=============


## 1. maven-surefire-plugin

设置skip为false


## 2. maven-surefire-report-plugin

绑定report到生命周期，生成html测试报告

报告： target/site/surefire-report.html


## 3. jacoco-maven-plugin

配置扫描范围，配置阀值threshold

报告： target/site/jacoco/index.html


## 4. maven-checkstyle-plugin

代码格式检查

报告：target/site/checkstyle.html


## 5. findbugs-maven-plugin

bug检查

报告： target/site/findbugs