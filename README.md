# SnackToa
Show message(Snackbar, Toast) in your application. Customization warning, information and success messages.

<p align="center">
  <img width="40%" src="https://raw.githubusercontent.com/mustafaynk/SnackToa/master/preview/logo.png">
</p>

- Preview

<p align="center">
  <img width="50%" src="https://raw.githubusercontent.com/mustafaynk/SnackToa/master/preview/snacktoa.gif">
</p>


### Usage

Usage Toast

```Java
SnackToa.toastInfo(MainActivity.this, "Info Toast");
```

Usage Snackbar

```Java
SnackToa.snackBarInfo(MainActivity.this, "Info Snackbar");
```

Usage SnackbarFloating in Activity

```Java
SnackToa.snackBarFloating(findViewById(android.R.id.content), MainActivity.this, "Error Snackbar", new SnackToa.snackbarUndoClick() {
                    @Override
                    public void onClick(View v) {
                        SnackToa.toastInfo(MainActivity.this, "Undo Clicked");
                    }
                });
```

Usage SnackbarFloating in Fragment

```Java
...

private View view;

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.your_layout, container, false);
		
		...
		SnackToa.snackBarFloating(view, getActivity(), "Error Snackbar", new SnackToa.snackbarUndoClick() {
                    @Override
                    public void onClick(View v) {
                        SnackToa.toastInfo(MainActivity.this, "Undo Clicked");
                    }
                });
		...
		return view;
}
```


### Installation

Download the latest JAR or grab via Maven:
```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
	
<dependency>
	<groupId>com.github.mustafaynk</groupId>
	<artifactId>SnackToa</artifactId>
	<version>1.0</version>
</dependency>
```
or Gradle: 
- Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

- Add the dependency
```
dependencies {
	implementation 'com.github.mustafaynk:SnackToa:v1.1'
}
```
