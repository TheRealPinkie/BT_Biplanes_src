public final class i
{
  public static boolean a;
  public static final int[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, -10, -11, -13, -12, -20, -21, -1, -2, -3, -4, -6, -7, -5, 42, 35 };
  private static final int[][] c = { { 0 }, { 1 }, { 2, 10 }, { 3 }, { 4, 12 }, { 5, 14 }, { 6, 13 }, { 7 }, { 8, 11 }, { 9 }, { 10, 20 }, { 11, 21 }, { 12, 19 }, { 13 }, { 15 }, { 16 }, { 10, 20 }, { 11, 21 }, { 12, 19 }, { 13 }, { 15 }, { 16 }, { 14 }, { 17 }, { 18, 14 } };
  public static boolean[] d = new boolean[22];
  private static int e = 0;
  private static int f = 0;
  private static int[] g = new int[20];

  private static int[] d(int paramInt)
  {
    for (int i = 0; i < b.length; i++)
      if (paramInt == b[i])
        return c[i];
    return null;
  }

  public static void a(int paramInt)
  {
    int[] arrayOfInt = d(paramInt);
    if (arrayOfInt != null)
      for (int i = 0; i < arrayOfInt.length; i++)
      {
        int j = arrayOfInt[i];
        e(j);
        d[j] = true;
      }
    a = true;
  }

  private static void e(int paramInt)
  {
    g[(f++)] = paramInt;
    if (f >= 20)
      f = 0;
    if (f == e)
    {
      e += 1;
      if (e >= 20)
        e = 0;
    }
  }

  public static void b(int paramInt)
  {
    a = false;
    int[] arrayOfInt = d(paramInt);
    if (arrayOfInt == null)
      return;
    for (int i = 0; i < arrayOfInt.length; i++)
    {
      int j = arrayOfInt[i];
      if (d[j] != 0)
        d[j] = false;
    }
  }

  public static boolean c(int paramInt)
  {
    return d[paramInt];
  }

  public static int a()
  {
    if (e == f)
      return -66;
    int i = g[(e++)];
    if (e >= 20)
      e = 0;
    return i;
  }

  public static void b()
  {
    int i = 22;
    do
    {
      d[i] = false;
      i--;
    }
    while (i >= 0);
    a = false;
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     i
 * JD-Core Version:    0.6.2
 */