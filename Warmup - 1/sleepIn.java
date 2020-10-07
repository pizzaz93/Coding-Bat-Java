public boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday && !vacation ){
    return false;
  }
  return true;
}
