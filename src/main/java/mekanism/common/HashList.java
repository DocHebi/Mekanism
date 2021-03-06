package mekanism.common;

import java.util.ArrayList;
import java.util.Iterator;

public class HashList<T> implements Iterable<T>
{
	private ArrayList<T> list = new ArrayList<T>(256);

	public boolean contains(T obj)
	{
		return list.contains(obj);
	}

	public void clear()
	{
		list.clear();
	}

	public T get(int index)
	{
		if(index > size()-1)
		{
			return null;
		}

		return list.get(index);
	}

	public void add(T obj)
	{
		if(!list.contains(obj))
		{
			list.add(obj);
		}
	}

	public void add(int index, T obj)
	{
		if(!list.contains(obj))
		{
			if(index > size())
			{
				for(int i = size(); i <= index-1; i++)
				{
					list.add(i, null);
				}
			}

			list.add(index, obj);
		}
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}

	public void remove(int index)
	{
		if(isEmpty() || index > size()-1)
		{
			return;
		}

		list.remove(index);
	}

	public void replace(int index, T obj)
	{
		if(get(index) != null)
		{
			remove(index);
		}

		add(index, obj);
	}

	public void remove(T obj)
	{
		list.remove(obj);
	}

	public int indexOf(T obj)
	{
		return list.indexOf(obj);
	}

	public int size()
	{
		return list.size();
	}

	@Override
	public int hashCode()
	{
		return list.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return list.equals(obj);
	}

	@Override
	public Iterator iterator()
	{
		return list.iterator();
	}
}
