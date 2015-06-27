package utils

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import utils.ArbolBinario._

@RunWith(classOf[JUnitRunner])
class ArbolBinarioSuite extends FunSuite {

  test("test de test") {
    assert(1 + 2 === 3)
  }

  test("test insert un elemento") {
    assert(countNodes(treeInsert(2, EmptyTree())) == 1)
  }

  test("test countNodes") {
    assert(countNodes(treeInsert(1,
      treeInsert(3,
        treeInsert(2,
          EmptyTree())))) == 3)
  }
  
  test("test elem exist") {
    assert(elem(2,treeInsert(1,
      treeInsert(3,
        treeInsert(2,
          EmptyTree())))))
  }
  
  test("test elem not exist") {
    assert(!elem(20,treeInsert(1,
      treeInsert(3,
        treeInsert(2,
          EmptyTree())))))
  }
  
  test("test elem en doble") {
    assert(elem(4,double(treeInsert(1,
      treeInsert(3,
        treeInsert(2,
          EmptyTree()))))))
  }
  
  test("test to List") {
    assert(toList(treeInsert(1,
      treeInsert(3,
        treeInsert(2,
          EmptyTree())))) == List(1,2,3))
  }

}
