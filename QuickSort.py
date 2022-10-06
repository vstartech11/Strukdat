def partition(low, high, arr):
	pivot, h = arr[high], low
	for i in range(low, high):
		if arr[i] <= pivot:
			arr[i], arr[h] = arr[h], arr[i]
			h += 1
	arr[h], arr[high] = arr[high], arr[h]
	return h

def quickSort(low, high, arr):
	if low < high:
		index = partition(low, high, arr)
		quickSort(low, index - 1, arr)
		quickSort(index + 1, high, arr)

tahuisi = [4,5,1,2,9,7,0,6,8,3]
print(tahuisi)
quickSort(0, len(tahuisi) - 1, tahuisi)
print(tahuisi)