def searchInsertPosition(nums, target):
    low = 0
    high = len(nums) - 1

    while (low <= high):
        mid = (low + high) // 2

        if (nums[mid] == target):
            return mid
        elif (nums[mid] < target):
            low = mid + 1
        else:
            high = mid - 1

    return low


print(searchInsertPosition([1, 3, 5, 6], 5))
print(searchInsertPosition([1, 3, 5, 6], 2))