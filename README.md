## Android-commons

Librería minimalista para ayudar en tareas comunes en Android como

- Injección de coroutines dispatchers
- Logging
- Manejo de SharedPreferences con delegados de kotlin
- y un poco de syntactic sugar


Nota: esta libreria aun esta en proceso de planeación
pero se puede jugar con ella.


root build.gradle
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

dependency
```kotlin
dependencies {
   implementation 'com.github.carlosezam:android-commons:b17c663667'
}
```  
