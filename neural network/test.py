from Network import *
'''
this file is use to test all the function taht a write for neural network
'''

print("hello")

h= Network()
h.set_layer(6)
print(h.get_data())
h.add_all_neural([6,4,4,3,2,1])
h.create_network()
print(h.get_data())
for elem in h.link:
    print(elem)
