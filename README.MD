# NoteCode

NoteCode is a versatile tool designed to simplify note-taking during programming classes. It seamlessly integrates code snippets into HTML documents, providing a convenient way to organize and reference code examples within your notes.

## Installation

1. Download the repository.
2. Create a user snippet for the NoteCode folder in Visual Studio Code:
   - Press `Ctrl + Shift + P` to open the command palette.
   - Type `Configure User Snippets` and select `Preferences: Configure User Snippets`.
   - Choose the language for which you want to create the snippet (e.g., HTML).
   - Click on `New Snippet File for [folder_name]`.
   - Paste the contents of the `NoteCode.code-snippets` file into the newly created snippet file.
   
## Usage

1. Create a new HTML file in the desired location.
2. Type `embedIde` and press `Tab` to auto-generate a template.
3. Install the LivePreview extension in Visual Studio Code.
4. Right-click in the HTML code editor and select "Show Live Preview".
5. Write your notes under the `<head>` tag using HTML tags for images, links, etc.
6. To include code:
   - Save the code with a unique filename in the `codes` folder.
   - Type `#filename.code-block.extension` and press `Tab` to auto-generate a `<div>` displaying the code.
   - Save the notes by pressing `Ctrl + S`.

## Example

```html
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Embedded IDE</title>
  <!-- Include necessary CSS and JavaScript files -->
</head>

<!-- Write your notes here -->
<h1>Welcome to NoteCode!</h1>
  
<!-- Insert code snippet -->
\#main.java.code-block.java




##Contributing
If you encounter any issues or have suggestions for improvements, feel free to contribute by submitting a pull request or opening an issue on GitHub.

##License
This project is licensed under the MIT License.