A=10

def pure_sum(x,y): #bu fonksiyon pure yani yan etkisiz. bunu her jhngi bir yan etkisi olmaz ancak girdi verdiğin xzaman çıktı alabilrsin
    return x+y
def unpure_sum(y): #bu ise yan etkili bir fonksiyon. dişariadan etklenir :) buda bazı sıkıntılara sebebiyet  vereblir
    return A+y

print("pure_sum(10,12) =",pure_sum(10,12))
print("unpure_sum(5) =",unpure_sum(5))
