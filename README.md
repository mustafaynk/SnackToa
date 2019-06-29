# SnackToa
SnackToa customizes the warning messages in your application.

![](https://raw.githubusercontent.com/mustafaynk/SnackToa/master/preview/logo.png)

- Preview

![](https://raw.githubusercontent.com/mustafaynk/SnackToa/master/preview/snacktoa.gif)

###Usage

Usage SnacbarFloating in Activity

```Java
SnackToa.snackBarFloating(findViewById(android.R.id.content), MainActivity.this, "Error Snackbar");
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
		SnackToa.snackBarFloating(view, getActivity(), "Error Snackbar");
		...
		return view;
}
```


###Installation

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
	        implementation 'com.github.mustafaynk:SnackToa:1.0'
	}
```
