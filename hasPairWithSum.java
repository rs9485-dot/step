def hasPairWithSum(nums, target):
    seen = set()

    for num in nums:
        complement = target - num

        if (complement in seen):
            return True

        seen.add(num)

    return False


print(hasPairWithSum([2, 7, 11, 15], 9))
print(hasPairWithSum([3, 4, 6], 20))