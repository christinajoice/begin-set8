n=int(input())
l=map(int,input().split())
li=[int(i) for i in range(l+1,r)]
  if n in li:
    print("yes")
  else:
    print("no")
