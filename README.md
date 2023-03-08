# MyCityApp на Compose
Приложение для Android, которое отображает рекомендации о том, чем заняться и что посетить в городе.

Этот образец демонстрирует:
* Material navigation components
* Material 3 theming & dynamic colors.
* Реализация приложения с рекомендуемой архитектурой приложения, используя ViewModels, UiState и Jetpack Navigation.

MyCity использует Material 3 для цвета, типографии и темы. Он также поддерживает как светлый, так и темный режим в зависимости от настроек системы. 
Конструктор Material Theme используется для создания темы Material 3 и непосредственного экспорта ее для Compose.

# Дизайн приложения
![Merged_document](https://user-images.githubusercontent.com/90140295/223730696-9b2f6e7a-7162-40a4-8d8a-9799059df8c4.png)

# Динамические темы
![dynamic_theming](https://user-images.githubusercontent.com/90140295/223728307-3055afc8-eac2-4952-8b8b-dbbc97a12694.png)


# Данные
MyCity имеет имеет статические локальные поставщики данных для категорий, рекомендованных мест, локаций и изображений. 
Предоставляет ViewModelэти данные для компоновки ReplyApp через StateFlow.
