# Heroku buildpack: Gauge


<b>Usage</b><br>

This buildpack is made to use Gauge test automation framework in Heroku (runtime). Make sure your $PATH variable includes <code>/app/.gauge</code> before using it. <br>
This buildpack also installs all gauge plugins. You can remove the plugins you don't want by editing the compile file. For that, you will need to fork this project and commit to the new version.

<code>cp -r /app/.gauge $1</code>
This command in the compile file copies the gauge files to the build folder and the gauge becomes available in the runtime.


<b>Installation</b> <br>
You can add it to /Settings/Buildpacks section.

https://github.com/erdemkiiliic/heroku-buildpack-gauge

Also, you can add with simple command.

<code>heroku buildpacks:set https://github.com/erdemkiiliic/heroku-buildpack-gauge.git -a myapp </code>
