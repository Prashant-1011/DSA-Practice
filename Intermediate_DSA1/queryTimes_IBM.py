import sys
def getQueryTime(list):
    ans = 0
    while(len(list) > 0):
        max = -sys.maxsize - 1
        #Getting max value
        for i in range(len(list)):
            if list[i] > max:
                max = list[i]

        if (max % 2 != 0):
           list.remove(max)
        else:
            ans += 1
            even_counts = 0
            for i in range(len(list)):
                if(len(list) > 0 and max in list):
                    even_counts += 1
                    list.remove(max)
            
            while (even_counts > 0):
                if((max // 2) % 2 == 0):
                    list.append((max // 2))
                even_counts -= 1

    return ans

list = [3, 24]
reuslt = getQueryTime(list)
print(reuslt, 'reuslt')