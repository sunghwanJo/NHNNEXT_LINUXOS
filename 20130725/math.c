double power(double a, int b) {
	double ret = 1.0;
	int i;
	for (i = 0 ; i < b ; i ++)
		ret *= a;
	return ret;
}
