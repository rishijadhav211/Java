function customReduce(arr, callback, initialValue) {
    let accumulator = initialValue !== undefined ? initialValue : arr[0];
    const startIndex = initialValue !== undefined ? 0 : 1;
  
    for (let i = startIndex; i < arr.length; i++) {
      accumulator = callback(accumulator, arr[i], i, arr);
    }
  
    return accumulator;
  }
  
  
  const numbers = [1, 2, 3, 4, 5];
  
  // Define a callback function to sum the numbers
  const sumCallback = function (accumulator, currentValue) {
    return accumulator + currentValue;
  };
  
  // Use the custom reduce function with the callback
  const sum = customReduce(numbers, sumCallback, 0);
  
  console.log(sum); // Output: 15
  