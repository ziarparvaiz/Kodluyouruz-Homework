# Insertion Sort Projesi

### Proje 1

[22,27,16,2,18,6] -> Insertion Sort

1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
2. Big-O gösterimini yazınız.
3. Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.


[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

<hr />


## Çozüm:- 

### 1:- `[22, 27, 16, 2, 18, 6]`
### 2:- `[2, 27, 16, 22, 18, 6]`
### 3:- `[2, 6, 16, 22, 18, 27]`
### 4:- `[2, 6, 16, 22, 18, 27]`
### 5:- `[2, 6, 16, 18, 22, 27]`
### 6:- `[2, 6, 16, 18, 22, 27]`

## Time Complexity:- 
- Best Case: `O (n)`
- Avarege Case: `O (n^2)`
- worst Case: `O (n^2)`

## Dizi sıralandıktan sonra `18` avarage case kapsamına girer.


## [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

### 1:- `[7,3,5,8,2,9,4,15,6]`
### 2:- `[2,3,5,8,7,9,4,15,6]`
### 3:- `[2,3,4,8,7,9,5,15,6]`
### 4:- `[2,3,4,7,8,9,5,15,6]`


## Insertion Sort in Python

```python
def Insertion_Sort(Array_List):
    Index_Lenght = range(1, len(Array_List))

    for i in Index_Lenght :
        value_to_sort = Array_List[i]

        while Array_List[i-1] > value_to_sort and i > 0:
            Array_List[i], Array_List[i-1] = Array_List[i-1], Array_List[i]
            i = i - 1

    return Array_List

MYARR = [22, 27, 16, 2, 18, 6]
print("Original Array: ", MYARR)
print("Sorted Array: ", Insertion_Sort(MYARR))
```
> #### Input & Output
```bash
Original Array:  [22, 27, 16, 2, 18, 6]
Sorted Array:  [2, 6, 16, 18, 22, 27]
```