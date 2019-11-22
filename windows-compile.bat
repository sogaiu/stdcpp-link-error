@echo off

if "%GRAALVM_HOME%"=="" (
    echo Please set GRAALVM_HOME
    exit /b
)

%GRAALVM_HOME%\bin\javac JavaHttpsExample.java

call %GRAALVM_HOME%\bin\native-image.cmd ^
  JavaHttpsExample ^
  "-H:Name=stdcpp-link-error" ^
  "-H:EnableURLProtocols=https" ^
  --verbose
