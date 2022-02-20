# Welcome 👋🏻 to Appium Fast Boilerplate

## Why this repo?

- Provides a basic implementation for Appium based Android/iOS tests
- Could be used as the initial boilerplate to evolve into a full-fledged framework
- Beginner friendly
- Provides an example project supporting a talk given during Appium Conf 2021
  - on [Hello Appium! Setting up your First Appium Tests efficiently](https://confengine.com/conferences/appium-conf-2021/proposal/15501/hello-appium-setting-up-your-first-appium-tests-efficiently)
  - Please see the slides (in documentation format)
    at [automationhacks.io/slides](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/00-welcome/)
    and then checkout 2021 tab

## Pre setup

- Follow setup steps for:
  - [Common](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/04-common-libraries/)
  - [Android](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/05-setup-for-android/)
  - [iOS](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/09-setup-for-ios/)

## Run Android tests

```zsh
gradle wrapper clean build runTests -Dtag="ANDROID" -Ddevice="ANDROID"
```

```zsh
gradle wrapper clean build runTests -Dtag="IOS" -Dtarget="IOS"
```

