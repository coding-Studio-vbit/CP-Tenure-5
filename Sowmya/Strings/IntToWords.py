class Solution:
    def numberToWords(self, num: int) -> str:
        d = {0: "Zero", 1: "One", 2: "Two", 3: "Three", 4: "Four", 5: "Five", 6: "Six",
            7: "Seven", 8: "Eight", 9: "Nine", 10: "Ten", 11: "Eleven", 12: "Twelve",
            13: "Thirteen", 14: "Fourteen", 15: "Fifteen", 16: "Sixteen",
            17: "Seventeen", 18: "Eighteen", 19: "Nineteen", 20: "Twenty", 30: "Thirty",
            40: "Forty", 50: "Fifty", 60: "Sixty", 70: "Seventy", 80: "Eighty",
            90: "Ninety", 100: "Hundred", 1000: "Thousand", 1000000: "Million",
            1000000000: "Billion"
            }

        def lessThanThousand(n: int) -> str:
            if(n==0):
                return ""
            elif(n>0 and n<20):
                return d[n]
            elif n%100==0:
                return d[n//100]+" " + d[100]
            elif n<100:
                return d[n // 10 * 10] + ("" if n % 10 == 0 else " " + d[n % 10])
            elif(n>100 and n<1000):
                return d[n // 100] + " Hundred"+ ("" if n % 100 == 0 else " " + lessThanThousand(n%100))
        
        if(num<1000):
            if num==0:
                return d[num]
            return lessThanThousand(num)
        elif(num==1000):
            return d[num//1000] + " " + d[1000]
        else:
            result = ""
            billion = num // 1000000000
            million = (num % 1000000000) // 1000000
            thousand = (num % 1000000) // 1000
            remainder = num % 1000
            
            if billion > 0:
                result += lessThanThousand(billion) + " Billion"
            if million > 0:
                result += (" " if result else "") + lessThanThousand(million) + " Million"
            if thousand > 0:
                result += (" " if result else "") + lessThanThousand(thousand) + " Thousand"
            if remainder > 0:
                result += (" " if result else "") + lessThanThousand(remainder)
            
            return result.strip()