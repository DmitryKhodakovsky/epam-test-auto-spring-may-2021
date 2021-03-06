# Maven

before:

```cmd
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_<update>
set PATH=%PATH%;%JAVA_HOME%\bin
cd <project dir>
md target\classes
where /r . *.java > sources.list
javac -d target\classes -encoding UTF-8 -source 1.8 -sourcepath src/main/java @sources.list
jar -cfen0 target\attraining.jar ru.training.at.hw1.App -C target\classes .
java -jar target\attraining.jar 100
```

after:

```cmd
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_<update>
set MAVEN_HOME=<maven_location>
set PATH=%PATH%;%JAVA_HOME%\bin;%MAVEN_HOME%\bin
cd <project dir>
mvn package
```

create maven project from console (^ symbol is used for multiline input)

```cmd 
mvn archetype:generate ^
    -DinteractiveMode=false ^
    -DarchetypeGroupId=org.apache.maven.archetypes ^
    -DarchetypeArtifactId=maven-archetype-quickstart ^
    -DarchetypeVersion=1.4 -DgroupId=ru.training.at ^
    -DartifactId=epam-test-auto-spring-2021 ^
    -Dversion=2021.04.22-SNAPSHOT
```

# References

JUnit 4

- https://github.com/junit-team/junit4/wiki/Getting-started -- официальный "Getting started", там сбоку есть блок "Pages", содержат много полезного

TestNG

- https://testng.org/doc/documentation-main.html

JUnit 5

- https://junit.org/junit5/docs/current/user-guide/

Hamcrest / AssertJ

- https://mkyong.com/tag/hamcrest/
- https://www.baeldung.com/?s=hamcrest
- https://www.baeldung.com/introduction-to-assertj
- https://www.blazemeter.com/blog/hamcrest-vs-assertj-assertion-frameworks-which-one-should-you-choose

Про тесты в целом

- https://habr.com/ru/company/yandex/blog/346186/ -- можно пропустить последнюю часть про Espresso, и пока пропустить предпоследнюю часть про моки

Maven

- https://maven.apache.org/
- https://maven.apache.org/what-is-maven.html -- описание "зачем оно может использоваться"
- https://maven.apache.org/guides/getting-started/index.html -- достаточно длиный "Getting started"
- http://maven.apache.org/ref/3.6.3/maven-core/lifecycles.html -- перечисление фаз default Lifecycle
- https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html -- описание Lifecycle
- http://maven.apache.org/plugins/index.html -- описание плагинов

Не совсем документация, но мне в свое время оказалось более понятно

- https://habr.com/ru/post/77382/ -- обзор мавена
- https://habr.com/ru/sandbox/27207/ -- очень хорошо описаны профили
- https://web.archive.org/web/20200222031457/www.apache-maven.ru/index.html -- тут про плагины и их настройку

Idea and Git

- https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html#ecb8c00d
- https://www.jetbrains.com/help/idea/set-up-a-git-repository.html#add-remote (+ links on the left navigation bar)

:heavy_plus_sign: links from the presentation
