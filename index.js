// Function to fetch file content and initialize CodeMirror for all code blocks
function initializeAllCodeBlocks() {
  var codeBlocks = document.querySelectorAll('.code-block'); // Select all code blocks
  codeBlocks.forEach(function(block) {
    var fileName = "codes/" + block.id + "." + block.classList[1];
    var language = getLanguageMode(block.classList[1]); // Get language mode from extension class

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
      if (xhr.readyState === XMLHttpRequest.DONE) {
        if (xhr.status === 200) {
          initializeCodeMirror(block, xhr.responseText, language);
        } else {
          console.error('Failed to fetch file:', xhr.status);
        }
      }
    };
    xhr.open('GET', fileName, true);
    xhr.send();
  });
}

// Function to determine language mode from file extension
function getLanguageMode(extension) {
  switch (extension) {
    case 'py':
      return 'python';
    case 'c':
      return 'text/x-csrc'
    case 'cpp':
      return 'text/x-c++src';
    case 'java':
      return 'text/x-java';
    case 'html':
      return 'htmlmixed';
    case 'css':
      return 'css';
    default:
      return ''; // Add default language mode if needed
  }
}

// Function to initialize CodeMirror
function initializeCodeMirror(container, content, language) {
  console.log("Executed")
  var editor = CodeMirror(container, {
    value: content,
    mode: language,
    lineNumbers: true,
    theme: "default",
  });
}

console.log("Executed")
