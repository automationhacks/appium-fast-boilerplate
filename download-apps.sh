# exit when any command fails
set -e

# Download Demo apps for android and iOS from appium Github repo
# TODO: Files downloaded with below error out on trying to init AppiumServer, Find and fix this error
BASE_PATH=./src/test/resources
ANDROID_APP=ApiDemos-debug.apk
IOS_APP=TestApp.app.zip
ANDROID_PATH=$BASE_PATH/$ANDROID_APP
IOS_PATH=$BASE_PATH/$IOS_APP

mkdir -p $BASE_PATH
echo "Downloading sample files ..."
wget --no-check-certificate --content-disposition https://github.com/appium/appium/raw/master/packages/appium/sample-code/apps/$ANDROID_APP
mv $ANDROID_APP $ANDROID_PATH
wget --no-check-certificate --content-disposition https://github.com/appium/appium/raw/master/packages/appium/sample-code/apps/$IOS_APP
mv $IOS_APP $IOS_PATH
#tar -xvf $IOS_PATH
#rm $IOS_PATH
