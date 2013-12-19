package cn.edu.nju.ipo.dao

abstract class AbstractDao<T> {
	abstract def find(def query)
	abstract def insert(T)
	abstract def update(T)
	abstract def delete(T)
}
