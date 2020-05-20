list = dir('*.wav');
for i = 1 : length(list)
  filename = list(i).name;
  [y, fs] = wavread(filename);
  a = max(abs(y));
  if a < 0.01
    s = ['rm ' filename];
    fprintf(1, s);
    fprintf(1, '\n');
    system(s);
  end
end
