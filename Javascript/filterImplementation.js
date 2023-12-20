function customFilter(arr, callback) {
    const result = [];
  
    for (let i = 0; i < arr.length; i++) {
      if (callback(arr[i])) {
        result.push(arr[i]);
      }
    }
  
    return result;
  }
  
  
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  
  // Define a callback function to filter even numbers
  const isEven = function (value) {
    return value % 2 === 0;
  };
  
  // Use the custom filter function with the callback
  const evenNumbers = customFilter(numbers, isEven);
  
  console.log(evenNumbers); 
  