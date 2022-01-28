# Лабораторная работа 1.
## JSON & XML

1. Создать файл XML и соответствующую ему схему XSD. 
2. При разработке XSD использовать простые и комплексные типы, перечисления, шаблоны и предельные значения, обязательно использование атрибутов и типа ID.
3. Сгенерировать или создать класс(ы) (Java), соответствующий данному описанию. 
4. Создать приложение для разбора XML-документа и инициализации коллекции объектов информацией из XML-файла. Для разбора использовать  DOM-парсер, XPath, JAXB. Для сортировки объектов использовать интерфейс Comparator.
5. Произвести проверку XML-документа с привлечением XSD. 
6. Выполнить преобразование объектов классов (JAXB) в JSON.

## Вариант 10

### Пиво.
- Name – название пива.
- Type – тип пива (темное, светлое, лагерное, живое).
- Al – алкогольное либо нет.
- Manufacturer – фирма-производитель.
- Ingredients (должно быть несколько) – ингредиенты: вода, солод, хмель, сахар и т.д.
- Chars (должно быть несколько) – характеристики: кол-во оборотов (если алкогольное), прозрачность (в процентах), фильтрованное либо нет, пищевая ценность (ккал), способ разлива (объем и материал емкостей)
- Корневой элемент назвать Beer.
