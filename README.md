# Java Uncommon Bug: ArrayIndexOutOfBoundsException

This repository demonstrates a subtle and uncommon bug in Java related to array indexing. The `UncommonBug.java` file contains code that attempts to access an array element beyond the array's bounds. This typically leads to an `ArrayIndexOutOfBoundsException`, but sometimes the error might be harder to catch.

## Description
The bug occurs due to an off-by-one error.  The array is initialized with a size of 5, but the code tries to access the 6th element (index 5), which is out of bounds.