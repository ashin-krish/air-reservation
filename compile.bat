@echo off
cls

if not exist bin mkdir bin

echo Compiling all Java files...

dir /s /b src\*.java > sources.txt

javac -d bin @sources.txt

del sources.txt

if %errorlevel% neq 0 (
    echo.
    echo Compilation Failed!
    pause
    exit /b
)

echo.
echo Compilation Successful!
pause