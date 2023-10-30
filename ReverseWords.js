// JavaScript
// 1.Take a sentence as an input and reverse every word in that sentence. Example - This is a sunny day > shiT si a ynnus yad.

  function reverseWords(stringValue) {
    let reversedSentence = "";
    let word = "";
    let isWord = false;
  
    for (let i = 0; i < stringValue.length; i++) {
      const char = stringValue[i];
  
      if (char === ' ') {
        if (isWord) {
          for (let j = word.length - 1; j >= 0; j--) {
            reversedSentence += word[j];
          }
          isWord = false;
          word = "";
        }
  
        reversedSentence += ' ';
      } else {
        isWord = true;
        word += char;
      }
    }
  
    if (isWord) {
      for (let j = word.length - 1; j >= 0; j--) {
        reversedSentence += word[j];
      }
    }
  
    return reversedSentence;
  }
  
  const inputSentence = "Likith Raj K";
  const reversedSentence = reverseWords(inputSentence);
  console.log(reversedSentence);