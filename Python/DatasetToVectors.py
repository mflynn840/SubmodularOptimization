from img2vec_pytorch import Img2Vec
from PIL import Image

img2vec = Img2Vec(cuda=True)

img = Image.open('dag')

vec = img2vec.get_vec(img, tensor=True)
vecs = img2vec.get_vec(list_ofImgs, tensor=True) #returns torch tensor





class DatasetTool:



    def __init__(self, name:int):
