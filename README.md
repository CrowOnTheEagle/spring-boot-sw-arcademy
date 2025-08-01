# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.arcademy.spring-boot-sw-arcademy' is invalid and this project uses 'com.arcademy.spring_boot_sw_arcademy' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.4/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.4/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.4/reference/web/servlet.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.4/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

This Message is from HELP.md which automatically created by spring boot initializer

================================================================================================

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

This Message is from README.md which automatically created by java console app project

================================================================================================

작성자: 이동희(2022301056)

## Project Summary(프로젝트 개요)

이 프로젝트는 25-2학기 SW아카데미지원사업의 스프링 프로젝트 폴더입니다.

## 폴더 설명
 * 파일(날짜) - 해당 날짜의 실습 파일입니다.

## 프로젝트 설정
 * 언어: Java
 * 자바버전: 17
 * 패캐징: jar
 * 의존성(Dependencies)
   * spring web
   * spring boot devtools - 코드 저장 후 자동실행

## 실습실 IP
 * 공통: 210.110.33
 * 208 209 210 211    212 213 214 215
 * 216 217 218 219    220 221 222 223
 * 224 225 226 227    228 229 230 231(나)

## 강사님 화면공유 링크
 * https://meet.jit.si/ShowMeTheTiger