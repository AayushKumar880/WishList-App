WishList-App

<font size="5">WishList-App</font> is a simple and intuitive Android application built using Kotlin and Jetpack Compose. The app uses the MVVM architecture pattern and incorporates navigation components for seamless navigation. It uses RoomDB for local data storage. Users can add wishes with descriptions, and they can easily edit or delete a wish by swiping on the wish item.

<font size="4 Features</font>

- Add wishes with descriptions
- Edit or delete wishes by swiping
- Local data storage using RoomDB
- MVVM architecture pattern
- Navigation components for smooth transitions


<font size="4>Installation</font>

<font size="3>Prerequisites</font>

- Android Studio 4.1 or higher
- Android device or emulator running API level 21 or higher

<font size="3">Setup</font>

1. Clone the repository:
    ```sh
    git clone https://github.com/AayushKumar880/WishList-App.git
    cd WishList-App
    ```

2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Run the app on your device or emulator.

<font size="4">Architecture</font>

This app follows the MVVM (Model-View-ViewModel) architecture pattern. Here's a brief overview of the components:

- **Model**: Manages the data and business logic of the app. For this project, RoomDB is used to manage local data storage.
- **View**: Displays the data to the user and handles user interactions. This is built using Jetpack Compose.
- **ViewModel**: Acts as a bridge between the Model and the View. It holds the app's UI data and handles the logic for UI events.

<font size="4">Libraries Used</font>

- [Kotlin](https://kotlinlang.org/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [RoomDB](https://developer.android.com/training/data-storage/room)
- [Navigation Component](https://developer.android.com/guide/navigation)

<font size="4">Usage</font>

1. Launch the app.
2. Add a new wish by clicking on the 'Add' button and entering the wish and its description.
3. Edit a wish by swiping it and selecting the 'Edit' option.
4. Delete a wish by swiping it and selecting the 'Delete' option.

<font size="4">Contributing</font>

Contributions are welcome! Please fork this repository and submit pull requests for any improvements or bug fixes.

<font size="4">Contact</font>

If you have any questions or suggestions, feel free to contact me at aayushiitism@gmail.com.
